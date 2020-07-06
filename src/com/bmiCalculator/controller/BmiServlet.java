package com.bmiCalculator.controller;

import java.io.IOException;

public class BmiServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // get parameter from request
        String name = request.getParameter("name");
        String height = request.getParameter("height");
        String weight = request.getParameter("weight");

        // calculate bmi
        float h = Float.valueOf(height);
        float w = Float.valueOf(weight);
        float bmi = w / (h * h);

        String msg = "";

        if (bmi <= 18.5) {
            msg = "You are underweight!";
        } else if (bmi > 18.5 && bmi <= 23.9) {
            msg = "You are healthy!";
        } else if (bmi > 23.9 && bmi <= 27) {
            msg = "You are overweight!";
        } else {
            msg = "You are obese";
        }

        System.out.println("msg = " + msg);

        msg = name + ", your BMI is " + bmi + ", " + msg;

        // save data to request
        request.setAttribute("msg", msg);

        // redirect to new page
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
