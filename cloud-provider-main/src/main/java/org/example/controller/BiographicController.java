package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.entities.CommonResult;
import org.example.entities.dto.BiographicalNote;
import org.example.service.BiographicalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huzq
 * @version V1.0
 * @package org.example.controller
 * @date 2024/5/15 0:38
 */

@RestController
@Slf4j
public class BiographicController {

    public BiographicController(BiographicalService biographicalService) {
        this.biographicalService = biographicalService;
    }

    private final BiographicalService biographicalService;


    @GetMapping("/biographic/get/{id}")
    public CommonResult<BiographicalNote> getByID(@PathVariable("id")Integer id) {
        CommonResult<BiographicalNote> ret = new CommonResult<>();
        if (id == null) {
            ret.setCode(400);
            ret.setMessage("参数错误");
            return ret;
        }
        BiographicalNote note = biographicalService.getByID(id);
        if (note == null) {
            ret.setCode(404);
            ret.setMessage("对象不存在");
        }
        else {
            ret.setCode(200);
            ret.setData(note);
            ret.setMessage("请求成功");
        }
        return ret;
    }
}
