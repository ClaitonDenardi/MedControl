package cdpaulus.medcontrol.database;

public class ScriptBD {

    public static  String getCreateTable(){
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE `medicamento` (");
        sql.append("`codBarras`	INTEGER NOT NULL,");
        sql.append("`NomeTecnico`\tTEXT NOT NULL,");
        sql.append("`NomeComercial`\tTEXT NOT NULL,");
        sql.append("`hora`\tINTEGER NOT NULL,");
        sql.append("PRIMARY KEY(`codBarras`));");
        sql.append("INSERT INTO medicamento VALUES (789815693129, \"Cloridrato de Difenidrama\", \"Benatux\", 1);\n");
        sql.append("INSERT INTO medicamento VALUES (789815693129, \"Dipirona monoidratada\", \"Novalgina\", 1);\n");


        return sql.toString();
    }

}
