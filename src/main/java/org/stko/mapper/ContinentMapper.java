package org.stko.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.oorsprong.websamples.ArrayOftContinent;
import org.oorsprong.websamples.TContinent;
import org.stko.models.ContinentDto;

import java.util.List;

@Mapper(config = QuarkusMappingConfig.class)
public interface ContinentMapper {

    default List<ContinentDto> map(ArrayOftContinent arrayOftContinent) {
        if (arrayOftContinent == null) {
            return null;
        }

        return map(arrayOftContinent.getTContinent());
    }

    List<ContinentDto> map(List<TContinent> continents);

    @Mapping(target = "code", source = "SCode")
    @Mapping(target = "name", source = "SName")
    ContinentDto map(TContinent continent);

}
