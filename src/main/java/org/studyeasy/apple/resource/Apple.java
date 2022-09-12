package org.studyeasy.apple.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.apple.model.Device;
import org.studyeasy.apple.model.Devices;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apple")
public class Apple {
    @RequestMapping("/devices")
    public Devices getDevice(){
        List<Device> devices = new ArrayList<>();
        devices.add( new Device("Iphone 10", "smartphone"));
        devices.add( new Device("Ipad X", "Tablet"));
        Devices devicesList = new Devices(devices);
        return devicesList;
    }
}
