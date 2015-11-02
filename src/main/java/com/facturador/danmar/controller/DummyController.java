package com.facturador.danmar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.danmar.dbf.dto.filtro.FiltroArticulo;
import com.facturador.danmar.form.ArticuloForm;
import com.facturador.danmar.form.ClienteForm;


@Controller
public class DummyController {

	
	
	@RequestMapping("/Probando")
	public ModelAndView getVersion(){
		return new ModelAndView("version");
	}


	/**
	 * Busca todos los clientes disponibles
	 * 
	 * @return
	 */
	@RequestMapping(value = "/cliente/findAll", method = RequestMethod.GET)
	public @ResponseBody	List<ClienteForm> findAllClientes() {
		return getCliente();
	}
	
	@RequestMapping(value = "/cliente/searchByFiltro/{filtro}", method = RequestMethod.GET)
	public @ResponseBody List<ClienteForm> searchClientesByFiltro(@PathVariable String filtro) {
		return getCliente();
	}

	@RequestMapping(value = "/cliente/getById/{id}", method = RequestMethod.GET)
	public @ResponseBody ClienteForm getClienteById(@PathVariable String id) {
		return getCliente(1, "DANMAR RTOS SUCURSAL R.CASTILL","COXO DA SILVA M.J.SH");
	}
	
	@RequestMapping(value = "/articulo/findAll", method = RequestMethod.GET)
	public @ResponseBody	List<ArticuloForm> findAllArticulos() {
		return getArticulos();
	}
	
	@RequestMapping(value = "/articulo/searchByFiltro/{filtro}", method = RequestMethod.GET)
	public @ResponseBody List<ArticuloForm> searchArticulosByFiltro(@PathVariable String filtro) {
		return getArticulos();
	}

	@RequestMapping(value = "/articulo/searchByFiltros/{filtro}", method = RequestMethod.GET)
	public @ResponseBody List<ArticuloForm> searchArticulosByFiltro(@PathVariable FiltroArticulo filtro) {
		return getArticulos();
	}

	@RequestMapping(value = "/articulo/getById/{id}", method = RequestMethod.GET)
	public @ResponseBody ArticuloForm getArticuloById(@PathVariable String id) {
		return getArticulo("C6","23","0710", "Solen.Arr.Indiel Chev.C-20","SOL.APL.CHEV.P.UP");
	}

	private List<ClienteForm> getCliente(){
		List<ClienteForm> clientes = new ArrayList<ClienteForm>();
		
		clientes.add(getCliente(1, "DANMAR RTOS SUCURSAL R.CASTILL","COXO DA SILVA M.J.SH"));
		clientes.add(getCliente(2, "ENDIVIAS BELGRANO S.A.","ENDIVIAS BELGRANO S.A."));
		clientes.add(getCliente(3, "KERNIS S.A.EN FORMACION","KERNIS S.A.EN FORMACION"));
		clientes.add(getCliente(4, "GONZALEZ JORGE","GONZALEZ JORGE"));
		
		return clientes;
	}
	
	private ClienteForm getCliente(int codigo, String nombre, String razonSocial){
		ClienteForm form = new ClienteForm();
		form.setCodigo(codigo);
		form.setNombre(nombre);
		form.setRazonSocial(razonSocial);
		form.setaCargo("a cargo");
		form.setCategoria("categoria");
		form.setCondicionPago("condicionPago");
		form.setContacto("contacto");
		form.setCuit("cuit");
		form.setDescuento1("descuento1");
		form.setDescuento2("descuento1");
		form.setDescuento3("descuento1");
		form.setDescuento4("descuento1");
		form.setDescuento5("descuento1");
		form.setDescuento6("descuento1");
		form.setDireccion("direccion");
		form.setDomicilioEntrega("domicilioEntrega");
		form.setDomicilioFiscal("domicilioFiscal");
		form.setfUltPago("31-10-2015");
		form.setHorario("20:30");
		form.setProvincia("provincia");
		form.setLocalidad("localidad");
		form.setRetencionIb("0.25");
		form.setSaldo("100.00");
		form.setSaldoNc("100.00");
		form.setTelefono("47384643");
		form.setTipo("1");
		form.setUltimoPago("31-10-2015");
		form.setVarios("varios");
		form.setVendedor("vendedor");
		
		return form;
	}
	
	private List<ArticuloForm> getArticulos(){
		List<ArticuloForm> articulos = new ArrayList<ArticuloForm>();
	
		articulos.add(getArticulo("C6","23","0710", "Solen.Arr.Indiel Chev.C-20","SOL.APL.CHEV.P.UP"));
		articulos.add(getArticulo("C6","64","0432", "Ruedas","zaraza"));
		return articulos;
	}
	
	private ArticuloForm getArticulo(String cc1, String cc2, String cc3,String nombre, String descripcion){
		ArticuloForm form = new ArticuloForm();
		form.setCc1(cc1);
		form.setCc2(cc2);
		form.setCc3(cc3);
		form.setCc4("");
		form.setCc5("");;
		form.setRecambio("");;
		form.setArticulo(nombre);;
		form.setDescuentoAdicional(descripcion);;
//		form.setdescamplia;
		form.setTipo("01");; //tipo de articulo
		form.setLinea("33");;
		form.setPrecioLp("604,37");;
		form.setCosto("604,37");;
		form.setPrecio("604,37");;
		form.setPrecioMayorista("604,37");;
		form.setManoDeObra("604,37");;
		form.setTiempo("0");;
		form.setExistentes("0");;
		form.setReservados("0");;
		form.setCanMaxima("0");;
		form.setCanMinima("0");;
		form.setDescuentos("0");;
		form.setGanancia("");;
		form.setGananciaMy("0");;
		form.setListaPrecioAux("0");;
		form.setOrigen("0");;
		form.setFechaCompra("31-10-2015");;
		form.setFacturaCompra("0");;
		form.setProveedor("0");;
		form.setDescuentoProv1("0");;
		form.setDescuentoProv2("0");;
		form.setCodigoProv("K35640710IND");;
		form.setMonedaCos("0");;
		form.setfCamprec("31-10-2015");;
		form.setVariacion("0");;
		form.setVarMin("0");;
		form.setVarMay("0");;
		form.setfVarmin("0");;
		form.setfVarmay("0");;
		form.setVisible("FALSO");;		
		
		return form;
	}
	
}
