/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package fr.hoteia.qalingo.web.mvc.controller.reporting;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.hoteia.qalingo.core.web.servlet.ModelAndViewThemeDevice;
import fr.hoteia.qalingo.web.mvc.controller.AbstractQalingoController;

/**
 * 
 */
@Controller
public class ReportingController extends AbstractQalingoController {

	@RequestMapping(value = "/reporting.html*", method = RequestMethod.GET)
	public ModelAndView reporting(final HttpServletRequest request, final HttpServletResponse response) throws Exception {
		ModelAndViewThemeDevice modelAndView = new ModelAndViewThemeDevice(getCurrentVelocityPath(request), "reporting/reporting");
		
		final String titleKeyPrefixSufix = "reporting.reporting";
		initPage(request, response, modelAndView, titleKeyPrefixSufix);
		
        String contentTest = coreMessageSource.getMessage("home.content.text", null, getCurrentLocale(request));
		modelAndView.addObject("contentTest", contentTest);
		
        return modelAndView;
	}
    
}