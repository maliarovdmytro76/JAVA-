
    import java.util.HashMap;
import java.util.Map;


    public class SQLQueryBuilder {

        public static String buildSelectQuery(Map<String, Object> parameters) {
            StringBuilder query = new StringBuilder("SELECT * FROM cars WHERE ");

            boolean first = true;
            for (Map.Entry<String, Object> entry : parameters.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                if (value != null) {
                    if (!first) {
                        query.append(" AND ");
                    }
                    query.append(key).append(" = ");

                    // Append value with proper formatting
                    if (value instanceof String) {
                        query.append("'").append(value).append("'");
                    } else if (value instanceof Boolean) {
                        query.append((Boolean) value ? 1 : 0);
                    } else {
                        query.append(value);
                    }
                    first = false;
                }
            }

            if(first) {
                // In case no parameters had non-null values
                return "SELECT * FROM cars";
            }

            // Finish the query with a semi-colon if necessary
            query.append(";");
            return query.toString();
        }

        public static void main(String[] args) {
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("model", "V-60");
            parameters.put("country", "Germany");
            parameters.put("city", "Berlin");
            parameters.put("year", null);
            parameters.put("active", true);

            String sqlQuery = buildSelectQuery(parameters);
            System.out.println(sqlQuery);
        }
    }


