# ibiz-modeling-core

This module is the hand-written source line for the modeling service core.

The Java files under `../modelingservice/src/ibiz-modeling-core` were recovered
from a binary with CFR and are kept as behavior and API references only. They
are not included in this module's Maven source path.

The first source milestone covers:

- modeling version metadata;
- development-center, solution, and system user contracts;
- system-user thread context;
- core model type names;
- JDK-native Base64 and serialization helpers;
- model initializer, cloner, and V2 exchange extension points.

The remaining data-entity runtime, service runtime, DSL compiler/exporter,
database integration, and deployment integration still need to be implemented
as independent source modules.
