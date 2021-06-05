package br.edu.fateczl.WebServiceNotas.util;

import java.util.List;

import br.edu.fateczl.WebServiceNotas.model.entity.Aula;
import br.edu.fateczl.WebServiceNotas.model.entity.RelatorioDataAula;

public class Convert {

	public RelatorioDataAula convertDatasEmData(List<Aula> datas) {

		RelatorioDataAula rData = new RelatorioDataAula();

		rData.setD1(datas.get(0).getData());
		rData.setD2(datas.get(1).getData());
		rData.setD3(datas.get(2).getData());
		rData.setD4(datas.get(3).getData());
		rData.setD5(datas.get(4).getData());
		rData.setD6(datas.get(5).getData());
		rData.setD7(datas.get(6).getData());
		rData.setD8(datas.get(7).getData());
		rData.setD9(datas.get(8).getData());
		rData.setD10(datas.get(9).getData());
		rData.setD11(datas.get(10).getData());
		rData.setD12(datas.get(11).getData());
		rData.setD13(datas.get(12).getData());
		rData.setD14(datas.get(13).getData());
		rData.setD15(datas.get(14).getData());
		rData.setD16(datas.get(15).getData());
		rData.setD17(datas.get(16).getData());
		rData.setD18(datas.get(17).getData());
		rData.setD19(datas.get(18).getData());
		rData.setD20(datas.get(19).getData());

		return rData;

	}
}
