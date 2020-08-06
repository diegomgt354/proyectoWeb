package com.diego.euromodul.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diego.euromodul.interfaceService.IClienteService;
import com.diego.euromodul.interfaceService.ICompraProveedorService;
import com.diego.euromodul.interfaceService.IFacturaService;
import com.diego.euromodul.interfaceService.IPresupuestoService;
import com.diego.euromodul.interfaceService.IProductoService;
import com.diego.euromodul.interfaceService.IProveedorService;
import com.diego.euromodul.model.cliente;
import com.diego.euromodul.model.compraProveedor;
import com.diego.euromodul.model.factura;
import com.diego.euromodul.model.presupuesto;
import com.diego.euromodul.model.producto;
import com.diego.euromodul.model.proveedor;

@Controller
@RequestMapping
public class Controlador {

	@Autowired
	IClienteService serviceCliente;
	String cliString = "cliente";

	@Autowired
	IProductoService serviceProducto;
	String proString = "producto";

	@Autowired
	IPresupuestoService servicePresupuesto;
	String preString = "presupuesto";

	@Autowired
	IFacturaService serviceFactura;
	String facString = "factura";

	@Autowired
	IProveedorService serviceProveedor;
	String proveeString = "proveedor";

	@Autowired
	ICompraProveedorService serviceCompraProveedor;
	String comProString = "compraProveedor";

	///////////////////////// clientes/////////////////////////////////////

	@GetMapping("/listarClientes")
	public String listar(Model modelo) {
		List<cliente> listar = serviceCliente.listar();
		modelo.addAttribute(cliString, listar);
		return "listarClientes";
	}

	@GetMapping("/newClientes")
	public String agregar(Model modelo) {
		modelo.addAttribute(cliString, new cliente());
		return "agregarClientes";
	}

	@PostMapping("/saveClientes")
	public String save(cliente c, Model modelo) {
		serviceCliente.save(c);
		return "redirect:/listarClientes";
	}

	@GetMapping("/editarClientes/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<cliente> cli = serviceCliente.listarId(id);
		model.addAttribute(cliString, cli);
		return "editarClientes";
	}

	@GetMapping("/eliminarClientes/{id}")
	public String delete(@PathVariable int id, Model model) {
		serviceCliente.delete(id);
		return "redirect:/listarClientes";
	}

	///////////////////////// clientes/////////////////////////////////////

/////////////////////////productos/////////////////////////////////////

	@GetMapping("/listarProductos")
	public String listarP(Model modelo) {
		List<producto> listar = serviceProducto.listar();
		modelo.addAttribute(proString, listar);
		return "listarProductos";
	}

	@GetMapping("/newProductos")
	public String agregarP(Model modelo) {
		modelo.addAttribute(proString, new producto());
		return "agregarProductos";
	}

	@PostMapping("/saveProductos")
	public String saveP(producto p, Model modelo) {
		serviceProducto.save(p);
		return "redirect:/listarProductos";
	}

	@GetMapping("/editarProductos/{id}")
	public String editarP(@PathVariable int id, Model model) {
		Optional<producto> pro = serviceProducto.listarId(id);
		model.addAttribute(proString, pro);
		return "editarProductos";
	}

	@GetMapping("/eliminarProductos/{id}")
	public String deleteP(@PathVariable int id, Model model) {
		serviceProducto.delete(id);
		return "redirect:/listarProductos";
	}

/////////////////////////productos/////////////////////////////////////

/////////////////////////presupuesto/////////////////////////////////////

	@GetMapping("/listarPresupuestos")
	public String listarPre(Model modelo) {
		List<presupuesto> listar = servicePresupuesto.listar();
		modelo.addAttribute(preString, listar);
		return "listarPresupuestos";
	}

	@GetMapping("/newPresupuestos")
	public String agregarPre(Model modelo) {
		modelo.addAttribute(preString, new presupuesto());
		return "agregarPresupuestos";
	}

	@PostMapping("/savePresupuestos")
	public String savePre(presupuesto p, Model modelo) {
		servicePresupuesto.save(p);
		return "redirect:/listarPresupuestos";
	}

	@GetMapping("/editarPresupuestos/{id}")
	public String editarPre(@PathVariable int id, Model model) {
		Optional<presupuesto> pro = servicePresupuesto.listarId(id);
		model.addAttribute(preString, pro);
		return "editarPresupuestos";
	}

	@GetMapping("/eliminarPresupuestos/{id}")
	public String deletePre(@PathVariable int id, Model model) {
		servicePresupuesto.delete(id);
		return "redirect:/listarPresupuestos";
	}

/////////////////////////presupuesto/////////////////////////////////////

////////////////////////factura/////////////////////////////////////

	@GetMapping("/listarFacturas")
	public String listarF(Model modelo) {
		List<factura> listar = serviceFactura.listar();
		modelo.addAttribute(facString, listar);
		return "listarFacturas";
	}

	@GetMapping("/newFacturas")
	public String agregarF(Model modelo) {
		modelo.addAttribute(facString, new factura());
		return "agregarFacturas";
	}

	@PostMapping("/saveFacturas")
	public String saveF(factura f, Model modelo) {
		serviceFactura.save(f);
		return "redirect:/listarFacturas";
	}

	@GetMapping("/editarFacturas/{id}")
	public String editarF(@PathVariable int id, Model model) {
		Optional<factura> fac = serviceFactura.listarId(id);
		model.addAttribute(facString, fac);
		return "editarFacturas";
	}

	@GetMapping("/eliminarFacturas/{id}")
	public String deleteF(@PathVariable int id, Model model) {
		serviceFactura.delete(id);
		return "redirect:/listarFacturas";
	}

/////////////////////////factura/////////////////////////////////////

////////////////////////proveedor/////////////////////////////////////

	@GetMapping("/listarProveedores")
	public String listarPro(Model modelo) {
		List<proveedor> listar = serviceProveedor.listar();
		modelo.addAttribute(proveeString, listar);
		return "listarProveedores";
	}

	@GetMapping("/newProveedores")
	public String agregarPro(Model modelo) {
		modelo.addAttribute(proveeString, new proveedor());
		return "agregarProveedores";
	}

	@PostMapping("/saveProveedores")
	public String savePro(proveedor p, Model modelo) {
		serviceProveedor.save(p);
		return "redirect:/listarProveedores";
	}

	@GetMapping("/editarProveedores/{id}")
	public String editarPro(@PathVariable int id, Model model) {
		Optional<proveedor> pro = serviceProveedor.listarId(id);
		model.addAttribute(proveeString, pro);
		return "editarProveedores";
	}

	@GetMapping("/eliminarProveedores/{id}")
	public String deletePro(@PathVariable int id, Model model) {
		serviceProveedor.delete(id);
		return "redirect:/listarProveedores";
	}

/////////////////////////proveedor/////////////////////////////////////

////////////////////////compraProveedor/////////////////////////////////////

	@GetMapping("/listarCompraProveedor")
	public String listarCom(Model modelo) {
		List<compraProveedor> listar = serviceCompraProveedor.listar();
		modelo.addAttribute(comProString, listar);
		return "listarCompraProveedor";
	}

	@GetMapping("/newCompraProveedor")
	public String agregarCom(Model modelo) {
		modelo.addAttribute(comProString, new compraProveedor());
		return "agregarCompraProveedor";
	}

	@PostMapping("/saveCompraProveedor")
	public String saveCom(compraProveedor c, Model modelo) {
		serviceCompraProveedor.save(c);
		return "redirect:/listarCompraProveedor";
	}

	@GetMapping("/editarCompraProveedor/{id}")
	public String editarCom(@PathVariable int id, Model model) {
		Optional<compraProveedor> pro = serviceCompraProveedor.listarId(id);
		model.addAttribute(comProString, pro);
		return "editarCompraProveedor";
	}

	@GetMapping("/eliminarCompraProveedor/{id}")
	public String deleteCom(@PathVariable int id, Model model) {
		serviceCompraProveedor.delete(id);
		return "redirect:/listarCompraProveedor";
	}

///////////////////////// compraProveedor/////////////////////////////////////

}
