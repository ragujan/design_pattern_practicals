package com.rag.practicals.interpreter_pattern.test_4;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Context {
    private static Map<String, List<Row>> tables = new HashMap<>();

    static {
        List<Row> list = new LinkedList<>();
        list.add(new Row("Rag","jn"));
        list.add(new Row("John","Doe"));
        list.add(new Row("Dominic","Cruz"));
        list.add(new Row("Daniel","Corner"));

        tables.put("people",list);
    }
    private String table;
    private String column;
    private Predicate<String> whereFilter;

    List<String> search(){
        List<String> result = tables.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(table))
                .flatMap(entry -> Stream.of(entry.getValue()))
                .flatMap(Collection::stream)
                .map(Row::toString)
                .filter(whereFilter)
                .collect(Collectors.toList());

      return  result;
    }
    public static Map<String, List<Row>> getTables() {
        return tables;
    }

    public static void setTables(Map<String, List<Row>> tables) {
        Context.tables = tables;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public Predicate<String> getWhereFilter() {
        return whereFilter;
    }

    public void setWhereFilter(Predicate<String> whereFilter) {
        this.whereFilter = whereFilter;
    }
}
