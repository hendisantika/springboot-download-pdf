package com.hendisantika.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-download-pdf
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/02/22
 * Time: 06.19
 */
@Service
public class ExportPdfService {
    private final Logger logger = LoggerFactory.getLogger(ExportPdfService.class);

    @Autowired
    private TemplateEngine templateEngine;
}
