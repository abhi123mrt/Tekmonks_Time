package com.abhinav.Tekmonks_Assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Time_Controller {

    @GetMapping("/getTimeStories")
    public List<Story> getStories() {

        List<Story> stories = new ArrayList<>();

        stories.add(new Story(
                "Amy Schneider’s Jeopardy! Streak Ends at 40 Consecutive Wins and $1.4 Million",
                "https://time.com/6142934/amy-schneider-jeopardy-streak-ends/"));

        stories.add(new Story(
                "'Writing With Fire' Shines a Light on All-Women News Outlet",
                "https://time.com/6142628/writing-with-fire-india-documentary/"));

        stories.add(new Story(
                "Moderna Booster May Wane After 6 Months",
                "https://time.com/6142852/moderna-booster-wanes-omicron/"));

        stories.add(new Story(
                "Pressure Mounts for Biden to Nominate a Black Woman to the Supreme",
                "https://time.com/6142743/joe-biden-supreme-court-nominee-black-woman-campaign-promise/"));

        stories.add(new Story(
                "The James Webb Space Telescope Is in Position—And Now We Wait",
                "https://time.com/6142769/james-webb-space-telescope-reaches-l2/"));

        stories.add(new Story(
                "We Urgently Need a New National COVID-19 Response Plan",
                "https://time.com/6142718/we-need-new-national-covid-19-response-plan/"));

        return stories;
    }
}
