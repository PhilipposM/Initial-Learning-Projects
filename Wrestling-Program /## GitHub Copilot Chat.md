## GitHub Copilot Chat

- Extension Version: 0.22.4 (prod)
- VS Code: vscode/1.95.2
- OS: Mac

## Network

User Settings:
```json
  "github.copilot.advanced": {
    "debug.useElectronFetcher": true,
    "debug.useNodeFetcher": false
  }
```

Connecting to https://api.github.com:
- DNS ipv4 Lookup: 140.82.121.6 (13 ms)
- DNS ipv6 Lookup: ::ffff:140.82.121.6 (2387 ms)
- Electron Fetcher (configured): HTTP 200 (418 ms)
- Node Fetcher: HTTP 200 (176 ms)
- Helix Fetcher: HTTP 200 (379 ms)

Connecting to https://api.individual.githubcopilot.com/_ping:
- DNS ipv4 Lookup: 140.82.112.22 (11 ms)
- DNS ipv6 Lookup: ::ffff:140.82.112.22 (3040 ms)
- Electron Fetcher (configured): HTTP 200 (450 ms)
- Node Fetcher: HTTP 200 (443 ms)
- Helix Fetcher: HTTP 200 (628 ms)

## Documentation

In corporate networks: [Troubleshooting firewall settings for GitHub Copilot](https://docs.github.com/en/copilot/troubleshooting-github-copilot/troubleshooting-firewall-settings-for-github-copilot).