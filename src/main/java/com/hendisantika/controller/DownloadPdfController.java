package com.hendisantika.controller;

import com.hendisantika.service.ExportPdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-download-pdf
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/02/22
 * Time: 06.20
 */
@Controller
public class DownloadPdfController {

    @Autowired
    private ExportPdfService exportPdfService;

}
