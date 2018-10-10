fun toCamelCase(str: String) =
        Regex("[-_]").split(str).asSequence()
                .mapIndexed { index, s -> if (index != 0) s.capitalize() else s }
                .joinToString("")