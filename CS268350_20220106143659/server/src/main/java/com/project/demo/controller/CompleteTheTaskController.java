package com.project.demo.controller;

import com.project.demo.entity.CompleteTheTask;
import com.project.demo.service.CompleteTheTaskService;
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
 *完成任务：(CompleteTheTask)表控制层
 *
 */
@RestController
@RequestMapping("/complete_the_task")
public class CompleteTheTaskController extends BaseController<CompleteTheTask,CompleteTheTaskService> {

    /**
     *完成任务对象
     */
    @Autowired
    public CompleteTheTaskController(CompleteTheTaskService service) {
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
