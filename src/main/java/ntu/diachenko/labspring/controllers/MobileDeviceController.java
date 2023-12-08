package ntu.diachenko.labspring.controllers;

import lombok.RequiredArgsConstructor;
import ntu.diachenko.labspring.entity.MobileDevice;
import ntu.diachenko.labspring.service.MobileDeviceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MobileDeviceController {
    private final MobileDeviceService mobileDeviceService;

    @GetMapping(path = "/mobiledevice")
    public @ResponseBody List<MobileDevice> getAllMobileDevice() {
        return mobileDeviceService.findAll();
    }
}
