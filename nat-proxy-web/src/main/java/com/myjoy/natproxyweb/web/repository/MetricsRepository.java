package com.myjoy.natproxyweb.web.repository;

import com.myjoy.natproxyweb.web.bean.Metrics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: steven.chen
 * @Title: MetricsRepository
 * @ProjectName: nat-proxy
 * @Description:
 * @date: 2022/2/8 11:48 AM
 **/
@Repository
public interface MetricsRepository extends JpaRepository<Long, Metrics> {

}
