package com.project.demo.controller;

import com.project.demo.entity.DeliveryClerk;
import com.project.demo.service.DeliveryClerkService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *配送员：(DeliveryClerk)表控制层
 *
 */
@RestController
@RequestMapping("/delivery_clerk")
public class DeliveryClerkController extends BaseController<DeliveryClerk,DeliveryClerkService> {

    /**
     *配送员对象
     */
    @Autowired
    public DeliveryClerkController(DeliveryClerkService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
