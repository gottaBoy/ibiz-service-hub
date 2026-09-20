package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysDynaInstDTO;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier(value="PSDEVSLNSYSDYNAINST")
public interface IPSDevSlnSysDynaInstService
extends IPSModelDEService<PSDevSlnSysDynaInstDTO, ISearchContextDTO> {
}
