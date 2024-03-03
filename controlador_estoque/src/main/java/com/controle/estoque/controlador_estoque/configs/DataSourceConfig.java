package com.controle.estoque.controlador_estoque.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    private final String nome_banco = "controle_estoque";
    private final String usuario_banco = "postgres";
    private final String senha_banco = "postgres";

    @Bean
    public DataSource dataSource() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setUrl("jdbc:postgresql://localhost:5432/" + nome_banco);
        dataSource.setUsername(usuario_banco);
        dataSource.setPassword(senha_banco);

        return dataSource;
    }
}

