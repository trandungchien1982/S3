package s3.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class S3Controller {

	private Logger log = LoggerFactory.getLogger(getClass());

	@GetMapping("/s3-upload-download")
	public String uploadAndDownload() {
		log.info(" ---- [S3-Basic] Upload & Download ... ");

		log.info(" ---- [S3-Basic] The data content: ");
		return "[Finish] S3-Upload+Download";
	}

	private byte[] getPdfContent() {
		return null;
	}

	private String getHtmlContent() {
		return null;
	}

	private byte[] getXlsxContent() {
		return null;
	}
}
