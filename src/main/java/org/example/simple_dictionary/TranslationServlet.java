package org.example.simple_dictionary;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
@WebServlet(name = "TranslationServlet", urlPatterns = "/translate")
public class TranslationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chào");
        dictionary.put("how", "thế nào");
        dictionary.put("book", "quyển vỡ");
        dictionary.put("computer", "Máy tính");
        String seach = req.getParameter("txtSeach");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        String result = dictionary.get(seach);
        if (result != null){
            writer.println("word: " + seach + "<br/>");
            writer.println("result: " + result);
        }else {
            writer.println("Not found");
        }
        writer.println("</html>");
    }
}
