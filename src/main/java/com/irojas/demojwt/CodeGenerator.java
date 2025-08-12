package com.irojas.demojwt;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {
        // 👇 Escribe aquí tus tablas separadas por coma
        String tablas = "categories,customers,employees,shippers,suppliers,products,orders,orderdetails";

        // 👇 Config DB (ajusta a tu entorno)
        String url = "jdbc:postgresql://localhost:5432/vueadmin";
        String username = "postgres";
        String password = "celeron";
        String schema = "public";

        String projectPath = System.getProperty("user.dir");

        FastAutoGenerator.create(url, username, password)
            .dataSourceConfig(builder -> builder
                .schema(schema)
            )
            .globalConfig(builder -> builder
                .author("Micuenta oficial：Richard Sivila")
                .outputDir(projectPath + "/src/main/java")
                .disableOpenDir() // equivalente a gc.setOpen(false)
                .commentDate("yyyy-MM-dd")
            )
            .packageConfig(builder -> builder
                .parent("com.irojas.demojwt")
                // Ruta donde se generarán los XML de mapper
                .pathInfo(Collections.singletonMap(
                    OutputFile.xml, projectPath + "/src/main/resources/mapper"
                ))
            )
            .strategyConfig(builder -> builder
                .addInclude(tablas.split(","))
                // Naming igual que antes
                .entityBuilder()
                    .enableLombok()
                    .naming(NamingStrategy.underline_to_camel)
                    .columnNaming(NamingStrategy.underline_to_camel)
                .mapperBuilder()
                    .enableBaseResultMap()
                    .enableBaseColumnList()
                .serviceBuilder()
                    .formatServiceFileName("%sService") // mantiene tu convención
                .controllerBuilder()
                    .enableHyphenStyle()     // equivalente a setControllerMappingHyphenStyle(true)
                    //.enableRestStyle()     // descomentá si quieres @RestController
            )
            // Usamos Freemarker (ya tienes la dependencia)
            .templateEngine(new FreemarkerTemplateEngine())
            .execute();

        System.out.println("TERMINO AQUI");
    }
}
