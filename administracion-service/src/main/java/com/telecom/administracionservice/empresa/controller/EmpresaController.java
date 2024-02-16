package com.telecom.administracionservice.empresa.controller;

import com.telecom.administracionservice.empresa.data.dto.EmpresaDTO;
import com.telecom.administracionservice.empresa.data.read.EmpresaRead;
import com.telecom.administracionservice.empresa.service.EmpresaService;
import com.telecom.administracionservice.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administracion")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/")
    /*@ApiOperation(value = "Obtiene toda la lista de Empresas", authorizations = {@Authorization(value = "JWT")})
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 403, message = "No autorizado para consumir el servicio")
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "offset", dataType = "integer", paramType = "query",
                    value = " Indica la distancia (desplazamiento) desde el inicio del objeto hasta un punto o elemento dado"),
            @ApiImplicitParam(name = "page", dataType = "integer", paramType = "query", readOnly = true,
                    value = "Numero de Página que desea recuperar (0..N)"),
            @ApiImplicitParam(name = "paged", dataType = "boolean", paramType = "query",
                    value = "Indica si se aplica o no se aplica la paginación al resultado de la consulta"),
            @ApiImplicitParam(name = "pageNumber", dataType = "integer", paramType = "query",
                    value = "Numero de Página que desea recuperar (0..N)"),
            @ApiImplicitParam(name = "pageSize", dataType = "integer", paramType = "query",
                    value = "Número de registros por página"),
            @ApiImplicitParam(name = "size", dataType = "integer", paramType = "query", readOnly = true,
                    value = "Número de registros por página"),
            @ApiImplicitParam(name = "sort", allowMultiple = true, dataType = "string", paramType = "query",
                    value = "Criterios de orden en el formato: propiedad (, asc | desc). " +
                            "El orden de clasificación predeterminado es ascendente. " +
                            "Se admiten varios criterios de clasificación."),
            @ApiImplicitParam(name = "sort.sorted", dataType = "boolean", paramType = "query",
                    value = "Indica si se aplica o no se aplica el orden a la clasificación del resultado de la consulta"),
            @ApiImplicitParam(name = "sort.unsorted", dataType = "boolean", paramType = "query",
                    value = "Indica si se aplica o no se aplica el desorden a la clasificación del resultado de la consulta"),
            @ApiImplicitParam(name = "unpaged", dataType = "boolean", paramType = "query",
                    value = "Indica si se aplica o no se aplica que el resultado de la consulta no se paginado")
    })*/
    public ResponseEntity<Page<EmpresaRead>> findAll(@PageableDefault(size = 10, page = 0) Pageable pageable) {
        return new ResponseEntity<>(empresaService.findAll(pageable), HttpStatus.OK);

    }
    @GetMapping("/{empresaId}")
    /*@ApiOperation(value = "Obtiene una Empresa por su id", authorizations = {@Authorization(value = "JWT")})
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Empresa no encontrado"),
            @ApiResponse(code = 403, message = "No autorizado para consumir el servicio")
    })*/
    public ResponseEntity<Response> getOne(
            /*@ApiParam(value = "ID de la empresa", required = true) */@PathVariable("empresaId") Integer empresaId
    ) {
        return new ResponseEntity<>(new Response(HttpStatus.OK.toString(), "Empresa encontrada", empresaService.getOne(empresaId)), HttpStatus.OK);
    }

    @PostMapping("/{interventorId}")
    /*@ApiOperation(value = "Guarda una Empresa según los parametros correspondientes", authorizations = {@Authorization(value = "JWT")})
    @ApiResponses({
            @ApiResponse(code = 202, message = "Empresa creado exitosamente"),
            @ApiResponse(code = 400, message = "Error de validación // Error en la creación del Empresa"),
            @ApiResponse(code = 403, message = "No autorizado para consumir el servicio")
    })*/
    public ResponseEntity<Response> save(
            /*@ApiParam(value = "ID del interventor", required = true)*/ @PathVariable("interventorId") Integer interventorId,
            /*@Valid @ApiParam(value = "Información de la empresa", required = true)*/ @RequestBody EmpresaDTO empresaDTO
    ) {
        return new ResponseEntity<>(new Response(HttpStatus.OK.toString(), "Empresa creada", empresaService.save(interventorId, empresaDTO)), HttpStatus.OK);
    }
    @DeleteMapping("/{interventorId}")
    /*@ApiOperation(value = "Elimina una Empresa por su id", authorizations = {@Authorization(value = "JWT")})
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Empresa no encontrado para eliminar"),
            @ApiResponse(code = 403, message = "No autorizado para consumir el servicio")
    })*/
    public ResponseEntity<Response> delete(/*@ApiParam(
            value = "ID de la empresa", required = true) */@PathVariable("interventorId") Integer interventorId
    ) {
        return new ResponseEntity<>(new Response(HttpStatus.OK.toString(), "Empresa eliminada", empresaService.delete(interventorId)), HttpStatus.OK);
    }
}
