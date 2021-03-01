package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "Filter", urlPatterns = "/*")
public class languageFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");
        HttpServletRequest request = (HttpServletRequest) req;
        String servletPath = request.getServletPath();
        System.out.println("#INFO - ServletPath: " + servletPath + ", URL: " + request.getRequestURL());
        chain.doFilter(req,res);
    }

    @Override
    public void destroy() {

    }
}
