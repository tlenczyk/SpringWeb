package pl.tls.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import pl.tls.beans.MyBean;

/**
 *
 * @author tomek
 */
public class Index2Controller implements Controller {

    private MyBean myBean;

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mav = new ModelAndView("index2");
        mav.addObject("name", myBean.getName());

        return mav;
    }

    public MyBean getMyBean() {
        return myBean;
    }

    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }
}
