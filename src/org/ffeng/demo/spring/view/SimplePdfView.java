package org.ffeng.demo.spring.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class SimplePdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<String> dummyModel = new ArrayList<String>();
		for(int i=0; i<100; i ++) {
			dummyModel.add("Item " + i);
		}
		
		for(int i =0; i< dummyModel.size();i ++) {
			document.add(new Paragraph(dummyModel.get(i)));
		}
			
	}

}
