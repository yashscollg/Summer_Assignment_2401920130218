public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }

    private void dfs(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("N,");
            return;
        }

        sb.append(root.val).append(",");
        dfs(root.left, sb);
        dfs(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));
        return build(q);
    }

    private TreeNode build(Queue<String> q) {
        String s = q.poll();

        if (s.equals("N"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = build(q);
        root.right = build(q);

        return root;
    }
}