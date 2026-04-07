package vendredi.soir.routecraft.file.hash;

import vendredi.soir.routecraft.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
