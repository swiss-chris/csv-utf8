package ch.example.csvutf8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class Controller {

    @GetMapping(value = "/v1/point-of-interest", produces = "text/csv")
    public void getPointsOfInterestCsv(HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8"); // return as UTF-8
        response.getWriter().write("BFNO;NAME;XCOORD;YCOORD;MAIN_CAT;SUB_CAT\n" +
                "1500000;7138 Surcuolm, Gästezimmer Garni Panorama Camping, Via Principala 11;9.14416;46.76035;accommodation;bnb");
    }
}
