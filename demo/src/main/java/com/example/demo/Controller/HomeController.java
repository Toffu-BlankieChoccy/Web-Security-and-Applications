package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.ExtendedEuclid;

@Controller
public class HomeController {
    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @PostMapping("/gcd")
    public ModelAndView gcd(
            @RequestParam(value = "a", defaultValue = "35") long a,
            @RequestParam(value = "b", defaultValue = "15") long b) {

        long gcd = ExtendedEuclid.gcdExtended(a, b);
        long x = ExtendedEuclid.lastx;
        long y = ExtendedEuclid.lasty;

        ModelAndView mav = new ModelAndView("result");
        mav.addObject("a", a);
        mav.addObject("b", b);
        mav.addObject("gcd", gcd);
        mav.addObject("x", x);
        mav.addObject("y", y);

        return mav;
    }
}
