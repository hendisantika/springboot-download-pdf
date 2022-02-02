package com.hendisantika.controller;

import com.hendisantika.service.ExportPdfService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;

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

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/downloadReceipt")
    public void downloadReceipt(HttpServletResponse response) throws IOException {
        Map<String, Object> data = createTestData();
        ByteArrayInputStream exportedData = exportPdfService.exportReceiptPdf("receipt", data);
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=receipt.pdf");
        IOUtils.copy(exportedData, response.getOutputStream());
    }
}
