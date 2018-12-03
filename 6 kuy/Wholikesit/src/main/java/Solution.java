class Solution {
    public static String whoLikesIt(String... names) {
        if (names == null || names.length == 0) return "no one likes this";
        StringBuilder likes = new StringBuilder();
        if (names.length == 1) {
            likes.append(names[0]);
            return likes.append(" likes this").toString();
        }
        if (names.length == 2)
            likes.append(names[0]).append(" and ").append(names[names.length - 1]);
        if (names.length > 2 && names.length < 4)
            likes.append(names[0]).append(", ").append(names[1]).append(" and ").append(names[2]);
        if (names.length > 3) {
            likes.append(names[0]).append(", ").append(names[1]).append(" and ").append(names.length - 2).append(" others");
        }
        return likes.append(" like this").toString();
    }
}