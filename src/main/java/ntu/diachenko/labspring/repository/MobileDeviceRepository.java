package ntu.diachenko.labspring.repository;

import ntu.diachenko.labspring.entity.MobileDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileDeviceRepository extends JpaRepository<MobileDevice, Integer> {
}

