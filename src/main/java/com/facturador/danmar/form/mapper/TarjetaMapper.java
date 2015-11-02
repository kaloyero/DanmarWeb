package com.facturador.danmar.form.mapper;

import com.danmar.dbf.dto.TarjetaDto;
import com.facturador.danmar.common.ConvertionUtil;
import com.facturador.danmar.common.FormatUtil;
import com.facturador.danmar.form.TarjetaForm;


public class TarjetaMapper extends MapperImpl<TarjetaDto,TarjetaForm>{


	public TarjetaDto getEntidad(TarjetaForm form) {
		TarjetaDto ent = new TarjetaDto();
		if (form != null){		

			
		}
		return ent;
	}

	public TarjetaForm getForm(TarjetaDto ent) {
		TarjetaForm tarjeta=new TarjetaForm();
		if (ent != null){
        	tarjeta.setCodigo( ConvertionUtil.StrValueOf(ent.getCodigo()));
        	tarjeta.setCuotas( ConvertionUtil.StrValueOf(ent.getCuotas()));
        	tarjeta.setCoeficiente(FormatUtil.format2DecimalsStr(ent.getCoeficiente()));

		}
		return tarjeta;
	}


}