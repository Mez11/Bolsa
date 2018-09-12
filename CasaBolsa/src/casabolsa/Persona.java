///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package casabolsa;
//
//import casabolsa.Domicilio;
//
///**
// *
// * @author 180910_GPO_SALINAS
// */
//public abstract class Persona {
//    protected String nombres;
//    protected String apellidoPaterno;
//    protected String apellidoMaterno;
//    protected Domicilio domicilio;
//    protected LocalDate fechaNacimiento;
//
//    public Persona(String nombres, String apellidoPaterno, String apellidoMaterno, Domicilio domicilio, LocalDate fechaNacimiento) {
//        this.nombres = nombres;
//        this.apellidoPaterno = apellidoPaterno;
//        this.apellidoMaterno = apellidoMaterno;
//        this.domicilio = domicilio;
//        this.fechaNacimiento = fechaNacimiento;
//    }
//  
//    public Persona(){
//        
//    }
//    public void imprimeEdad(){
//        
//    }
//    
//    @Override
//    public String toString() {
//        return "Persona{" + "nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", domicilio=" + domicilio + ", fechaNacimiento=" + fechaNacimiento + '}';
//    }
//
//    public String getNombres() {
//        return nombres;
//    }
//
//    public void setNombres(String nombres) {
//        this.nombres = nombres;
//    }
//
//    public String getApellidoPaterno() {
//        return apellidoPaterno;
//    }
//
//    public void setApellidoPaterno(String apellidoPaterno) {
//        this.apellidoPaterno = apellidoPaterno;
//    }
//
//    public String getApellidoMaterno() {
//        return apellidoMaterno;
//    }
//
//    public void setApellidoMaterno(String apellidoMaterno) {
//        this.apellidoMaterno = apellidoMaterno;
//    }
//
//    public Domicilio getDomicilio() {
//        return domicilio;
//    }
//
//    public void setDomicilio(Domicilio domicilio) {
//        this.domicilio = domicilio;
//    }
//
//    public LocalDate getFechaNacimiento() {
//        return fechaNacimiento;
//    }
//
//    public void setFechaNacimiento(LocalDate fechaNacimiento) {
//        this.fechaNacimiento = fechaNacimiento;
//    }
//   
//    
//    
//}
