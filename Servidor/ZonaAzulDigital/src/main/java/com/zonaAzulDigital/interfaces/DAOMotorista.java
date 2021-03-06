/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zonaAzulDigital.interfaces;

import com.zonaAzulDigital.Excecao.DaoException;
import com.zonaAzulDigital.Excecao.LoginException;
import com.zonaAzulDigital.entidades.Motorista;
import java.util.List;

/**
 *
 * @author JonasJr
 */
public interface DAOMotorista {
    public Motorista cadastrar(Motorista motorista) throws DaoException;

    public Motorista recuperar(String cpf) throws DaoException;

    public Motorista recuperarPorId(int id) throws DaoException;

    public Motorista atualizar(Motorista motorista) throws DaoException;
    
    public Motorista login(String cpf, String senha) throws LoginException;

    public List<Motorista> listarTudo();
}
