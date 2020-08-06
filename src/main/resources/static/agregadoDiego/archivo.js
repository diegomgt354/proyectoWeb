function eliminarClientes(id){
	swal({
		  title: "Esta seguro de eliminar el Cliente?",
		  text: "Una vez eliminado, ¡no podrá recuperar este archivo!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				  url:"/eliminarClientes/"+id,
				  success: function(res){
					  console.log(res);
				  }
			  });
		    swal("¡Su archivo de Cliente ha sido eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listarClientes";
		    	}
		    });
		  } else {
		    swal("¡Tu archivo de Cliente está a salvo!");
		  }
		});
	}

function eliminarProductos(id){
	swal({
		  title: "Esta seguro de eliminar el Producto?",
		  text: "Una vez eliminado, ¡no podrá recuperar este archivo!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				  url:"/eliminarProductos/"+id,
				  success: function(res){
					  console.log(res);
				  }
			  });
		    swal("¡Su archivo de Producto ha sido eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listarProductos";
		    	}
		    });
		  } else {
		    swal("¡Tu archivo de Producto está a salvo!");
		  }
		});
	}

function eliminarPresupuestos(id){
	swal({
		  title: "Esta seguro de eliminar el Presupuesto?",
		  text: "Una vez eliminado, ¡no podrá recuperar este archivo!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				  url:"/eliminarPresupuestos/"+id,
				  success: function(res){
					  console.log(res);
				  }
			  });
		    swal("¡Su archivo de Presupuesto ha sido eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listarPresupuestos";
		    	}
		    });
		  } else {
		    swal("¡Tu archivo de Presupuesto está a salvo!");
		  }
		});
	}

function eliminarFacturas(id){
	swal({
		  title: "Esta seguro de eliminar la Factura?",
		  text: "Una vez eliminado, ¡no podrá recuperar este archivo!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				  url:"/eliminarFacturas/"+id,
				  success: function(res){
					  console.log(res);
				  }
			  });
		    swal("¡Su archivo de Factura ha sido eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listarFacturas";
		    	}
		    });
		  } else {
		    swal("¡Tu archivo de Facturas está a salvo!");
		  }
		});
	}

function eliminarProveedores(id){
	swal({
		  title: "Esta seguro de eliminar el Proveedor?",
		  text: "Una vez eliminado, ¡no podrá recuperar este archivo!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				  url:"/eliminarProveedores/"+id,
				  success: function(res){
					  console.log(res);
				  }
			  });
		    swal("¡Su archivo de Proveedor ha sido eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listarProveedores";
		    	}
		    });
		  } else {
		    swal("¡Tu archivo de Proveedores está a salvo!");
		  }
		});
	}

function eliminarCompraProveedor(id){
	swal({
		  title: "Esta seguro de eliminar el la Compra?",
		  text: "Una vez eliminado, ¡no podrá recuperar este archivo!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				  url:"/eliminarCompraProveedor/"+id,
				  success: function(res){
					  console.log(res);
				  }
			  });
		    swal("¡Su archivo de Compra con el Proveedor ha sido eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listarCompraProveedor";
		    	}
		    });
		  } else {
		    swal("¡Tu archivo de Compra con el Proveedor está a salvo!");
		  }
		});
	}