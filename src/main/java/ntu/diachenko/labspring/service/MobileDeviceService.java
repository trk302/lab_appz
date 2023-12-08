package ntu.diachenko.labspring.service;

import lombok.RequiredArgsConstructor;
import ntu.diachenko.labspring.entity.MobileDevice;
import ntu.diachenko.labspring.repository.MobileDeviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MobileDeviceService {
    List<MobileDevice> findAll();
}

@Service
@RequiredArgsConstructor
class MobileDeviceServiceImpl implements MobileDeviceService {
    private final MobileDeviceRepository mobileDeviceRepository;

    @Override
    public List<MobileDevice> findAll() {
        return mobileDeviceRepository.findAll();
    }
}
