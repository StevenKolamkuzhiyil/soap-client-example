package org.stko.services;

import io.quarkiverse.cxf.annotation.CXFClient;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.oorsprong.websamples.ArrayOftContinent;
import org.oorsprong.websamples_countryinfo.CountryInfoServiceSoapType;
import org.stko.mapper.ContinentMapper;
import org.stko.models.ContinentDto;

import java.util.List;

@ApplicationScoped
public class ContinentService {

    @Inject
    @CXFClient("CountryInfoService")
    CountryInfoServiceSoapType countryInfoService;

    @Inject
    ContinentMapper continentMapper;

    public List<ContinentDto> getContinentList() {
        ArrayOftContinent continents = countryInfoService.listOfContinentsByName();
        return continentMapper.map(continents);
    }

}
