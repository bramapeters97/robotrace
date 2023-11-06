package robotrace;

/**
* Materials that can be used for the robots.
*/
public enum Material {

    /** 
     * Gold material properties.
     * Modify the default values to make it look like gold.
     */
    GOLD (
            
        new float[] {0.75164f, 0.60648f, 0.22648f, 1f},
        new float[] {0.628281f, 0.555802f,0.366065f, 1f},
        51.2f

    ),

    /**
     * Silver material properties.
     * Modify the default values to make it look like silver.
     */
    SILVER (
            
        new float[] {0.50754f, 0.50754f, 0.50754f, 1f},
        new float[] {0.508273f, 0.508273f, 0.508273f, 1f},
        51.2f

    ),

    /** 
     * Orange material properties.
     * Modify the default values to make it look like orange.
     */
    ORANGE (
            
        new float[] {0.992157f, 0.513726f, 0.0f, 1f},
        new float[] {0.0225f, 0.0225f, 0.0225f, 1f},
        12.8f

    ),

    /**
     * Wood material properties.
     * Modify the default values to make it look like Wood.
     */
    WOOD (

        new float[] {0.6f, 0.4f, 0f, 1f},
        new float[] {1f, 1f, 1f, 1f},
        20.0f

    );
    
    /** The diffuse RGBA reflectance of the material. */
    float[] diffuse;

    /** The specular RGBA reflectance of the material. */
    float[] specular;
    
    /** The specular exponent of the material. */
    float shininess;

    /**
     * Constructs a new material with diffuse and specular properties.
     */
    private Material(float[] diffuse, float[] specular, float shininess) {
        this.diffuse = diffuse;
        this.specular = specular;
        this.shininess = shininess;
    }
}
