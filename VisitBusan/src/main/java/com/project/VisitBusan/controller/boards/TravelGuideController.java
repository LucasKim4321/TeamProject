package com.project.VisitBusan.controller.boards;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/boards/travelGuide")
public class TravelGuideController {

    //가이드북
    @GetMapping("/list")
    public String travelGuideList() {
        return "/boards/travelGuide/list";
    }
    @GetMapping("/create")
    public String travelGuideCreate() {
        return "/boards/travelGuide/create";
    }
    @GetMapping("/modify")
    public String travelGuideModify() {
        return "/boards/travelGuide/modify";
    }

    //여행준비정보
    @GetMapping("/travelPreparation")
    public String showTravelPreparation() {
        return "/boards/travelGuide/travelPreparation";
    }
}
