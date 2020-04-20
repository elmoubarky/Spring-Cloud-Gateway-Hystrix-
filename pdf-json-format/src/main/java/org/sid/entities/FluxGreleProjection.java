package org.sid.entities;

import org.springframework.data.rest.core.config.Projection;
import java.util.Collection;

@Projection(name = "fluxProj", types = FluxGrele.class)
public interface FluxGreleProjection {

    //public Long getId();
    //public String getName();
    public Collection<Context> getContexts();
    public Collection<TechnicalHeaderbusinessData> getTechnicalHeaderbusinessData();
    public Collection<BusinessData> getBusinessData();
    //public Context getContext();
   // public TechnicalHeaderbusinessData getTechnicalHeaderbusinessData();
   // public BusinessData getBusinessData();
}
