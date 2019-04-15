package com.commerce.huayi.asyn;

import com.commerce.huayi.constant.LanguageEnum;
import com.commerce.huayi.entity.request.AbstractDictReq;
import com.commerce.huayi.mapper.TranslateMapper;
import com.commerce.huayi.service.TranslateService;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class AsynTranslateTask implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsynTranslateTask.class);

    private AbstractDictReq dictReq;
    private TranslateService translateService;


    public AsynTranslateTask(AbstractDictReq dictReq, TranslateService translateService) {
        this.dictReq = dictReq;
        this.translateService = translateService;
    }

    @Override
    public void run() {
        //增加产品字典翻译
        List<String> languages = Stream.of(LanguageEnum.values()).map(LanguageEnum::getLanguage).collect(Collectors.toList());
        for (String language : languages) {
            Map<String, Object> objectMap = dictReq.buildSql(language);
            if(MapUtils.isNotEmpty(objectMap)) {
                translateService.addTranslate(objectMap);
            }
        }

    }
}