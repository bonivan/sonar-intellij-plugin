package org.intellij.sonar.configuration.project;

import com.intellij.util.xmlb.annotations.Transient;
import org.intellij.sonar.configuration.SonarResourceBean;

import java.util.ArrayList;
import java.util.Collection;

public class ProjectSettingsBean {
  public String sonarServerHostUrl = "";

  public String user = "";

  // password is saved by PasswordSafe, but is also used for isModified in ProjectSettingsConfigurable
  @Transient
  public String password = "";

  public Boolean useAnonymous = Boolean.TRUE;

  public Collection<String> resources = new ArrayList<String>();

  public Collection<SonarResourceBean> downloadedResources = new ArrayList<SonarResourceBean>();

  // generated
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ProjectSettingsBean that = (ProjectSettingsBean) o;

    if (downloadedResources != null ? !downloadedResources.equals(that.downloadedResources) : that.downloadedResources != null)
      return false;
    if (password != null ? !password.equals(that.password) : that.password != null) return false;
    if (resources != null ? !resources.equals(that.resources) : that.resources != null) return false;
    if (sonarServerHostUrl != null ? !sonarServerHostUrl.equals(that.sonarServerHostUrl) : that.sonarServerHostUrl != null)
      return false;
    if (useAnonymous != null ? !useAnonymous.equals(that.useAnonymous) : that.useAnonymous != null) return false;
    if (user != null ? !user.equals(that.user) : that.user != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = sonarServerHostUrl != null ? sonarServerHostUrl.hashCode() : 0;
    result = 31 * result + (user != null ? user.hashCode() : 0);
    result = 31 * result + (password != null ? password.hashCode() : 0);
    result = 31 * result + (useAnonymous != null ? useAnonymous.hashCode() : 0);
    result = 31 * result + (resources != null ? resources.hashCode() : 0);
    result = 31 * result + (downloadedResources != null ? downloadedResources.hashCode() : 0);
    return result;
  }

  public boolean isEmpty() {
    return this.equals(new ProjectSettingsBean());
  }
}