package com.fangzhe.controller;

import com.fangzhe.pojo.LinkedMan;
import com.fangzhe.service.LinkedManService;
import com.fangzhe.service.LinkedManServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ASUS
 */
@Controller
@RequestMapping("/contact")
public class LinkedManController {
    @Autowired
    @Qualifier("linkedManServiceImpl")
    private LinkedManService linkedManService;

    /**
     * 联系人列表
     * @param model
     * @return allLinks
     */
    @RequestMapping("/allMans")
    public String list(Model model){
        List<LinkedMan> list = linkedManService.queryAllLinkedMan();
        model.addAttribute("list",list);
        return "allLinkedMan";
    }

    @RequestMapping("/toAddMan")
    public String toAddMan(){
        return "addLinkedMan";
    }
    /**
     * 添加联系人信息
     * @param man
     * @return allLinks
     */
    @RequestMapping("/addMan")
    public String addMan(LinkedMan man){
        linkedManService.addLinkedMan(man);
        System.out.println(man.getId()+" "+man.getName());
        System.out.println(man.getPhoneNumber());
        return "redirect:/contact/allMans";
    }
    @RequestMapping("/toUpdateMan")
    public String toUpdateMan(Model model,int id){
        LinkedMan man = linkedManService.queryLinkedManById(id);
        model.addAttribute("man",man);
        return "updateLinkedMan";
    }
    /**
     * 根据id更新联系人信息
     * @param man
     * @return allLinks
     */
    @RequestMapping("/updateMan")
    public String updateMan(Model model,LinkedMan man){
        linkedManService.updateLinkedMan(man);
        List<LinkedMan> mans = linkedManService.queryAllLinkedMan();
        model.addAttribute("list",man);
        return "redirect:/contact/allMans";
    }

    /**
     * 根据id删除联系人信息
     * @param id
     * @return allLinks
     */
    @RequestMapping("/del/{manId}")
    public String updateMan(@PathVariable("manId") int id){
        linkedManService.deleteLinkedManById(id);
        return "redirect:/contact/allMans";
    }
    //根据id查询联系人信息
    @RequestMapping("/queryMan")
    public String queryMan(int id,Model model){
        LinkedMan man = linkedManService.queryLinkedManById(id);
        List<LinkedMan> list = new ArrayList<LinkedMan>();
        list.add(man);
        model.addAttribute("list",list);
        return "allLinkedMan";
    }
}
