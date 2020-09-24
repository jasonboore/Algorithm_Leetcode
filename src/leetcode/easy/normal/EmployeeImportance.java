package leetcode.easy.normal;

import java.util.HashMap;
import java.util.List;

/**
 * 员工的重要性
 */
public class EmployeeImportance {
    static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
    static HashMap<Integer, Employee> map;
    public static int getImportance(List<Employee> employees, int id) {
        map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return dfs(id);
    }
    public static int dfs(int id) {
        int ans = map.get(id).importance;
        for (Integer subordinate : map.get(id).subordinates) {
            ans += dfs(subordinate);
        }
        return ans;
    }
}
