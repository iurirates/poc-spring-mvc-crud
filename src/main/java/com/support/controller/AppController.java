package com.support.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.support.model.Support;
import com.support.service.SupportService;

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    SupportService supportService;

    @Autowired
    MessageSource messageSource;

    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public ModelAndView welcome(ModelMap model) {
        ModelAndView mv = new ModelAndView();
        List<Support> list = supportService.listAllSupports();
        model.addAttribute("allsupports", list);
        mv.setViewName("allSupports");
        return mv;
    }

    @RequestMapping(value = { "/new" }, method = RequestMethod.GET)
    public String newSupportForm(ModelMap model) {
        Support newSupport = new Support();
        model.addAttribute("support", newSupport);
        model.addAttribute("edit", false);
        return "addSupportForm";
    }

    @RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public ModelAndView saveSupport(@Valid Support support, BindingResult result, ModelMap model) {
        ModelAndView mv = new ModelAndView();
        supportService.saveSupport(support);
        List<Support> list = supportService.listAllSupports();
        model.addAttribute("allsupports", list);
        model.addAttribute("success", "Ticket de suporte " + support.getDescription() + " adicionado com sucesso.");
        mv.setViewName("allSupports");
        return mv;
    }

    @RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
    public String editSupport(@PathVariable Long id, ModelMap model) {
        Support support = supportService.getSupport(id);
        model.addAttribute("support", support);
        model.addAttribute("edit", true);
        return "addSupportForm";
    }

    @RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
    public ModelAndView updateSupport(@Valid Support support, BindingResult result, ModelMap model,
            @PathVariable Long id) {
        ModelAndView mv = new ModelAndView();
        supportService.update(id, support);
        List<Support> list = supportService.listAllSupports();
        model.addAttribute("allsupports", list);
        model.addAttribute("success", "Ticket de suporte " + support.getDescription() + " atualizado com sucesso.");
        mv.setViewName("allSupports");

        return mv;
    }

    @RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
    public ModelAndView deleteSupport(@PathVariable Long id, ModelMap model) {
        ModelAndView mv = new ModelAndView();
        Support support = supportService.getSupport(id);
        supportService.delete(id);
        List<Support> list = supportService.listAllSupports();
        model.addAttribute("allsupports", list);
        model.addAttribute("success", "Ticket de suporte " + support.getDescription() + " removido com sucesso.");
        mv.setViewName("allSupports");
        return mv;
    }

}
