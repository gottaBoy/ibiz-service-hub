package net.ibizsys.modeling.core.sysutil.addin;

import java.util.ArrayList;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQJoinDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataQueryDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDEDQJoinService;
import net.ibizsys.modeling.core.sysutil.addin.PSModelInitializerBase;
import org.springframework.beans.factory.annotation.Autowired;

public class PSDEDataQueryInitializer
extends PSModelInitializerBase {
    @Autowired
    IPSDEDQJoinService iPSDEDQJoinService = null;

    @Override
    protected boolean onPrepare(IEntityDTO iEntityDTO, Object[] args, boolean bDraftMode) throws Throwable {
        if (bDraftMode) {
            PSDEDataQueryDTO et = (PSDEDataQueryDTO)iEntityDTO;
            PSDEDQJoinDTO psDEDataQueryJoin = new PSDEDQJoinDTO();
            psDEDataQueryJoin.setPSDEDQId(et.getPSDEDataQueryId());
            psDEDataQueryJoin.setPSDEDQName(et.getPSDEDataQueryName());
            psDEDataQueryJoin.setJoinPSDEId(et.getPSDEId());
            psDEDataQueryJoin.setJoinPSDEName(et.getPSDEName());
            psDEDataQueryJoin.setMainFlag(1);
            psDEDataQueryJoin.setPSDEJoinTypeId("MAIN");
            psDEDataQueryJoin.setPSDEDQJoinName(et.getPSDEName());
            ArrayList<PSDEDQJoinDTO> psDEDataQueryJoins = new ArrayList<PSDEDQJoinDTO>();
            psDEDataQueryJoins.add(psDEDataQueryJoin);
            et.setPSDEDQJoins(psDEDataQueryJoins);
        }
        return super.onPrepare(iEntityDTO, args, bDraftMode);
    }
}
