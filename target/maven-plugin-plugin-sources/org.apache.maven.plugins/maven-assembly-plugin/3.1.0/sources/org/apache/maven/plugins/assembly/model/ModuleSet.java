// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.3,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.plugins.assembly.model;

/**
 * 
 *         
 *         A moduleSet represent one or more project &lt;module&gt;
 * present inside
 *         a project's pom.xml. This allows you to include sources
 * or binaries
 *         belonging to a project's &lt;modules&gt;.
 * 
 *         <br/><b>NOTE:</b> When using &lt;moduleSets&gt; from the
 * command-line, it
 *         is required to pass first the package phase by doing:
 * "mvn package
 *         assembly:assembly". This bug/issue is scheduled to be
 * addressed by Maven 2.1.
 *         
 *       
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class ModuleSet
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * 
     *           If set to true, the plugin will include all
     * projects in the current reactor for processing
     *           in this ModuleSet. These will be subject to
     * include/exclude rules.
     *           Default value is true. (Since 2.2)
     *           .
     */
    private boolean useAllReactorProjects = false;

    /**
     * 
     *           If set to false, the plugin will exclude
     * sub-modules from processing in this ModuleSet.
     *           Otherwise, it will process all sub-modules, each
     * subject to include/exclude rules.
     *           Default value is true. (Since 2.2)
     *           .
     */
    private boolean includeSubModules = true;

    /**
     * Field includes.
     */
    private java.util.List<String> includes;

    /**
     * Field excludes.
     */
    private java.util.List<String> excludes;

    /**
     * 
     *             When this is present, the plugin will include
     * the source files of
     *             the included modules from this set in the
     * resulting assembly.
     *           
     */
    private ModuleSources sources;

    /**
     * 
     *             When this is present, the plugin will include
     * the binaries of the
     *             included modules from this set in the resulting
     * assembly.
     *           
     */
    private ModuleBinaries binaries;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addExclude.
     * 
     * @param string
     */
    public void addExclude( String string )
    {
        getExcludes().add( string );
    } //-- void addExclude( String )

    /**
     * Method addInclude.
     * 
     * @param string
     */
    public void addInclude( String string )
    {
        getIncludes().add( string );
    } //-- void addInclude( String )

    /**
     * Get when this is present, the plugin will include the
     * binaries of the
     *             included modules from this set in the resulting
     * assembly.
     * 
     * @return ModuleBinaries
     */
    public ModuleBinaries getBinaries()
    {
        return this.binaries;
    } //-- ModuleBinaries getBinaries()

    /**
     * Method getExcludes.
     * 
     * @return List
     */
    public java.util.List<String> getExcludes()
    {
        if ( this.excludes == null )
        {
            this.excludes = new java.util.ArrayList<String>();
        }

        return this.excludes;
    } //-- java.util.List<String> getExcludes()

    /**
     * Method getIncludes.
     * 
     * @return List
     */
    public java.util.List<String> getIncludes()
    {
        if ( this.includes == null )
        {
            this.includes = new java.util.ArrayList<String>();
        }

        return this.includes;
    } //-- java.util.List<String> getIncludes()

    /**
     * Get when this is present, the plugin will include the source
     * files of
     *             the included modules from this set in the
     * resulting assembly.
     * 
     * @return ModuleSources
     */
    public ModuleSources getSources()
    {
        return this.sources;
    } //-- ModuleSources getSources()

    /**
     * Get if set to false, the plugin will exclude sub-modules
     * from processing in this ModuleSet.
     *           Otherwise, it will process all sub-modules, each
     * subject to include/exclude rules.
     *           Default value is true. (Since 2.2).
     * 
     * @return boolean
     */
    public boolean isIncludeSubModules()
    {
        return this.includeSubModules;
    } //-- boolean isIncludeSubModules()

    /**
     * Get if set to true, the plugin will include all projects in
     * the current reactor for processing
     *           in this ModuleSet. These will be subject to
     * include/exclude rules.
     *           Default value is true. (Since 2.2).
     * 
     * @return boolean
     */
    public boolean isUseAllReactorProjects()
    {
        return this.useAllReactorProjects;
    } //-- boolean isUseAllReactorProjects()

    /**
     * Method removeExclude.
     * 
     * @param string
     */
    public void removeExclude( String string )
    {
        getExcludes().remove( string );
    } //-- void removeExclude( String )

    /**
     * Method removeInclude.
     * 
     * @param string
     */
    public void removeInclude( String string )
    {
        getIncludes().remove( string );
    } //-- void removeInclude( String )

    /**
     * Set when this is present, the plugin will include the
     * binaries of the
     *             included modules from this set in the resulting
     * assembly.
     * 
     * @param binaries
     */
    public void setBinaries( ModuleBinaries binaries )
    {
        this.binaries = binaries;
    } //-- void setBinaries( ModuleBinaries )

    /**
     * Set when &lt;exclude&gt; subelements are present, they
     * define a set of
     *             project artifact coordinates to exclude. If none
     * is present, then
     *             &lt;excludes&gt; represents no exclusions.
     * 
     *             Artifact coordinates may be given in simple
     * groupId:artifactId form,
     *             or they may be fully qualified in the form
     * groupId:artifactId:type[:classifier]:version.
     *             Additionally, wildcards can be used, as in
     * *:maven-*.
     * 
     * @param excludes
     */
    public void setExcludes( java.util.List<String> excludes )
    {
        this.excludes = excludes;
    } //-- void setExcludes( java.util.List )

    /**
     * Set if set to false, the plugin will exclude sub-modules
     * from processing in this ModuleSet.
     *           Otherwise, it will process all sub-modules, each
     * subject to include/exclude rules.
     *           Default value is true. (Since 2.2).
     * 
     * @param includeSubModules
     */
    public void setIncludeSubModules( boolean includeSubModules )
    {
        this.includeSubModules = includeSubModules;
    } //-- void setIncludeSubModules( boolean )

    /**
     * Set when &lt;include&gt; subelements are present, they
     * define a set of
     *             project coordinates to include. If none is
     * present, then
     *             &lt;includes&gt; represents all valid values.
     * 
     *             Artifact coordinates may be given in simple
     * groupId:artifactId form,
     *             or they may be fully qualified in the form
     * groupId:artifactId:type[:classifier]:version.
     *             Additionally, wildcards can be used, as in
     * *:maven-*.
     * 
     * @param includes
     */
    public void setIncludes( java.util.List<String> includes )
    {
        this.includes = includes;
    } //-- void setIncludes( java.util.List )

    /**
     * Set when this is present, the plugin will include the source
     * files of
     *             the included modules from this set in the
     * resulting assembly.
     * 
     * @param sources
     */
    public void setSources( ModuleSources sources )
    {
        this.sources = sources;
    } //-- void setSources( ModuleSources )

    /**
     * Set if set to true, the plugin will include all projects in
     * the current reactor for processing
     *           in this ModuleSet. These will be subject to
     * include/exclude rules.
     *           Default value is true. (Since 2.2).
     * 
     * @param useAllReactorProjects
     */
    public void setUseAllReactorProjects( boolean useAllReactorProjects )
    {
        this.useAllReactorProjects = useAllReactorProjects;
    } //-- void setUseAllReactorProjects( boolean )

}
